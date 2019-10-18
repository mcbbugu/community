function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    comment2target(questionId, 1, content);
}

function comment2target(targetId, type, content){
    if(!content){
        alert("评论不能为空哦")
        return;
    }
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType: 'application/json',
        data: JSON.stringify({
            "parentId": targetId,
            "content": content,
            "type": 1
        }),
        success: function (response) {
            if(response.code == 200){
                // $("#comment_section").hide();
                //刷新页面
                window.location.reload();
            }else {
                if(response.code == 2003){
                    var isAccepted = confirm(response.message);
                    if(isAccepted){
                        window.open("https://github.com/login/oauth/authorize?client_id=0154f308114d26acee50&redirect_uri=http://localhost:8887/callback&scope=user&state=1")
                        window.localStorage.setItem("closable", true);
                    }
                }else{
                    alert(response.message());
                }
            }
        },
        dataType: "json"
    });
}

function comment(e) {
    var commentId = e.getAttribute("data-id");
    console.log(commentId);
    var content = $("#input-" + commentId).val();
    comment2target(commentId, 2, content);
}
//展开二级评论
function collapseComments(e){
    var id = e.getAttribute("data-id");
    var comments = $("comment-" + id);
}