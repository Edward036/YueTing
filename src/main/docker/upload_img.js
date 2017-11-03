// document.write('<script language=javascript src="js/plupload.full.min.js"></script>');
// document.write('<script language=javascript src="js/plupload.dev.js"></script>');

var up_images = [];
var picture_remote = "";

function startImageUpload(file) {
    var url = "http://yun-dev.twirlingvr.com/admin/upload/picture";
    var param = {
        "filename": file.name
    };
    $.getJSON(url, param, function (result) {
        picture_remote = result.data.ossPath;
        img_uploader.setOption({
            'url': result.data.host,
            'multipart_params': result.data
        });
        img_uploader.start();
    });
}

var img_uploader = new plupload.Uploader({
    runtimes: 'html5,flash,silverlight,html4',
    browse_button: 'select_image',
    container: document.getElementById('img-src'),
    flash_swf_url: 'js/Moxie.swf',
    silverlight_xap_url: 'js/Moxie.xap',
    url: 'http://oss.ailyuncs.com',
    // 唯一文件名
    unique_names: true,
    // 上传格式限制
    filters: {
        mime_types: [
            {title: "Image files", extensions: "jpg,jpeg,gif,png"}
        ],
        prevent_duplicates: true // 不允许选取重复文件
    },
    init: {
        PostInit: function () {
        },
        // 添加文件
        FilesAdded: function (uploader, files) {
            if (files.length > 1) {
                alert("只能上传一个文件");
                up_images.removeFile(files[0]);
            } else {
                startImageUpload(files[0]);
            }
        },
        // 上传成功
        FileUploaded: function (uploader, file, info) {
            if (info.status !== 200) {
                return;
            }
            if (picture_remote.length !== 0) {
                document.getElementById('imghead').src = picture_remote;
            }
            up_images.push(file.id + ":0");
            $.ajax({
                url: "http://yun-dev.twirlingvr.com/admin/picture/insert2DB",
                type: 'POST',
                data: {
                    "uuid": $('#uuid').val(),
                    "coverphoto": file.name
                },
                success: function (result) {
                    document.getElementById('v_image').value = 1;
                    document.getElementById('imghead').src = picture_remote;
                    $('#form-validate').valid();
                },
                error: function (err) {
                    console.log(err);
                }
            });
        },
        BeforeUpload: function (uploader, file) {
            //
        },
        Error: function (uploader, err) {
            if (err.code == -601) {
                alert("文件格式不正确");
            } else if (err.code == -602) {
                alert("文件已存在");
            } else if (err.code == -403) {
                alert("AccessDenied");
            }
        },
        // 开始上传事件
        UploadFile: function (uploader, file) {
            var id = file.id;
        }
    }
});
img_uploader.init();