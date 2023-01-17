<script>
//adding click event on submit button
$(document).ready(
        function(){
//submit form
$("#customerForm").submit(function(event)
        {
        event.preventDefault();
        ajaxPost();
        })
    function ajaxPost()
    {
        var formData=
        {
         fullName: $('#fullName').val(),
         user:
             {
             emailId: $('#email').val(),
             password: $('#password').val(),
             rePassword: $('#rePassword').val(),
             firstName: $('#firstName').val();
             middleName: $('#middleName').val(),
             lastName: $('#lastName').val (),
             mobileNo: $('#mobileNo').val(),
             addressList:[
                    {
                     address1: $('#address1').val(),
                     address2: $("#address2").val(),
                     city: $('#city').val(),
                     state: $('#state').val(),
                     country: $('#country').val(),
                     landmark: $('#landmark').val(),
                     mobile: $('#mobile').val(),
                    }]
        }
        }
}
            $.ajax({
                 type:"POST",
                 url: "http://localhost:8080/api/private/users/customer",
                 data: JSON.stringify(formData),
                 contentType: "application/json",
                 dataType: 'json',
                 if(result.status=="success"){
                 $("#postResultDiv").html(
                        ""+result.data.fullName
                            + "Post Successfully! <br>
                            +"------>Congrats!!"
                            +"</p>");
                 }else{
                    $("#postResultDiv").html("<strong>Error</strong>");
                    }
                    console.log(result);
    },
})
</script>