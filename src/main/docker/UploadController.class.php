<?php
namespace Admin\Controller;

use Think\Controller;

class UploadController extends Controller
{
    private $type = 0;
    private $result = array();
    //
    private $sort = null;
    private $host = null;
    private $base64_policy = null;
    private $signature = null;
    private $expire = null;
    private $oss_path = null;
    private $oss_key = null;

    private function initUpload($type)
    {
        $filename = $_GET['filename'];
        if ($filename == null) {
            $this-> result = array();
            $this-> result['status'] = 400;
            $this-> result['msg'] = "请输入上传文件名称";
            $this-> result['data'] = "";
            exit;
        }
        //
        $this->sort = C("UPLOAD_SITEIMG_OSS")["driverConfig"]['AccessKeyId'];
        $key = C("UPLOAD_SITEIMG_OSS")["driverConfig"]['AccessKeySecret'];
        $this->host = $host = C('UPLOAD_SITEIMG_OSS')['host'];
        $now = time();
        //设置该policy超时时间是10s
        // 即这个policy过了这个有效时间，将不能访问
        $end = 30;
        $this->expire = $now + $end;
        $expiration = $this->gmt_iso8601($this->expire);
        //最大文件大小.用户可以自己设置
        $condition = array(0 => 'content-length-range', 1 => 0, 2 => 1048576000);
        $conditions[] = $condition;
        //表示用户上传的数据,必须是以$dir开始, 不然上传会失败,
        //这一步不是必须项,只是为了安全起见,
        //防止用户通过policy上传到别人的目录
        if ($this->type === 0) {
            $dir = "Upload_Picture/";
        } else if ($this->type === 1) {
            $dir = "WebUpload/";
        } else {
            $dir = "up_" . date("Y-m-d") . "/";
        }
        $start = array(0 => 'starts-with', 1 => '$key', 2 => $dir);
        $conditions[] = $start;
        $policy = array('expiration' => $expiration, 'conditions' => $conditions);
        $json_policy = json_encode($policy);
        $this->base64_policy = $base64_policy = base64_encode($json_policy);
        $this->signature = base64_encode(hash_hmac('sha1', $base64_policy, $key, true));
        $this->oss_key = $dir . $filename;
        $this->oss_path = $host . "/" . $this->oss_key;
        //
        $this-> result = array();
        $this-> result['status'] = 200;
        $this-> result['msg'] = "请把以下参数添加到上传请求中";
    }

    public function picture()
    {
        $this->type = 0;
        $this->initUpload();
        $response = array();
        $response['OSSAccessKeyId'] = $this->sort;
        $response['success_action_status'] = '200';
        $response['host'] = $this->host;
        $response['policy'] = $this->base64_policy;
        $response['signature'] = $this->signature;
        $response['expire'] = $this->expire;
        $response['ossPath'] = $this->oss_path;
        $response['key'] = $this->oss_key;
        //$sort.
        $this-> result['data'] = $response;
        $this->ajaxReturn($this-> result, 'JSON');
    }

    public function audio()
    {
        $this->type = 1;
        $this->initUpload();
        $response = array();
        $response['OSSAccessKeyId'] = $this->sort;
        $response['success_action_status'] = '200';
        $response['host'] = $this->host;
        $response['policy'] = $this->base64_policy;
        $response['signature'] = $this->signature;
        $response['expire'] = $this->expire;
        $response['ossPath'] = $this->oss_path;
        $response['key'] = $this->oss_key;
        //$sort.
        $this-> result['data'] = $response;
        $this->ajaxReturn($this-> result, 'JSON');
    }

    public function gmt_iso8601($time)
    {
        $dtStr = date("c", $time);
        $mydatetime = new \DateTime($dtStr);
        $expiration = $mydatetime->format(\DateTime::ISO8601);
        $pos = strpos($expiration, '+');
        $expiration = substr($expiration, 0, $pos);
        return $expiration . "Z";
    }
}