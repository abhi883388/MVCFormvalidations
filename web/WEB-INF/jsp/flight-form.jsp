<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight Information</title>
        <jsp:include page="include.jsp"></jsp:include>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
   <style>
   .error{color:red}    
   </style>
    </head>
    <body>
        <div class="container">
            <div class="overlay"></div>
            <center> <h2 class="badge-info">Flight Enquiry</h2> </center>
            <span class="alert-danger">Fields marked with asterisk(*) are mandatory</span>
        <div class="form-row">
             
            <div class="col-lg-2"></div>
            <div class="col-lg-10">
                 
        <br>
        <form:form id="myForm" action="processForm" modelAttribute="formData">
            <div class="form-row">
                <div class="col-lg-2">
            <strong><label>*Name :</label></strong>
                </div>
            <div class="col-lg-3">
            <form:input type="text" path="name" class="form-control" placeholder="Enter Name"/> 
            </div>
            <div class="col-lg-3">
            <form:errors path="name" cssClass="error"/>
            </div>
            </div>
           <div class="form-row">
                <div class="col-lg-2">
           <strong><label>*Date of Birth :</label></strong>
                </div>
                <div class="col-lg-3">
            <form:input type="text" path="dob" class="form-control" placeholder="Enter Date of Birth"/>
           </div>
           <div class="col-lg-3">
            <form:errors path="dob" cssClass="error"/>
            </div>
           </div>
            
             <div class="form-row">
                <div class="col-lg-2">
           <strong><label>*Flight Code :</label></strong>
                </div>
                <div class="col-lg-3">
            <form:input type="text" path="flightCode" class="form-control" placeholder="Enter Flight Code"/>
           </div>
           <div class="col-lg-5">
            <form:errors path="flightCode" cssClass="error"/>
            </div>
           </div>
            
           <div class="form-row">
             <div class="col-lg-2">
            <strong><label>Country From :</label></strong>
             </div>
             <div class="col-lg-3">
            <form:select path="fromCountry" class="form-control">
                <form:option value="0" label="Select Country From"/>
                <form:option value="IN" label="India"/>
                <form:option value="US" label="United States of America"/>
                <form:option value="CA" label="Canada"/>
            </form:select>
             </div>
            </div>
           <div class="form-row">
             <div class="col-lg-2">
            <strong><label>Country To :</label></strong>
             </div>
               
                   <div class="col-lg-3">
            <form:select path="toCountry" class="form-control">
                <form:option value="0" label="Select Country To"/>
                <form:options items="${countryOptions}"/>
                   
            </form:select>
                       </div>
            </div>
           <div class="form-row">
               <div class="col-lg-2">
            <strong><label>*Visa Type:</label></strong>
               </div>
               <div class="col-lg-3">
            Student<form:radiobutton path="visaType" value="student" />
            PR<form:radiobutton path="visaType" value="pr"/>
            Work<form:radiobutton path="visaType" value="work"/>
            Other<form:radiobutton path="visaType" value="other"/>
            </div>
            <div class="col-lg-3">
             <form:errors path="visaType" cssClass="error"/>
           </div>
           </div>
           <div class="form-row">
               <div class="col-lg-2">
            <strong><label>Languages Known:</label></strong>
               </div>
               <div class="col-lg-4">
            Hindi<form:checkbox path="langKnown" value="Hindi"/>
            Punjabi<form:checkbox path="langKnown" value="Punjabi"/>
            English<form:checkbox path="langKnown" value="English"/>
            French<form:checkbox path="langKnown" value="French"/>
               </div>
               <div class="col-lg-3">
            <form:errors path="langKnown" cssClass="error"/>
               </div>
           </div>
            <br>
            <br>
            <div class="form-row">
                <div class="col-lg-1"></div>
                <div class="col-lg-1">   
            <input type="submit" value="Submit" class="btn btn-success"/>
           </div>
                <div class="col-lg-1"></div>
                <div class="col-lg-1">
                    <a href="showForm"> <input type="button" value="Reset" class=" btn btn-danger reset"/></a>
                </div>
            </div>
        </form:form>
        <br>
        <c:if test="${status=='pass'}">
            <span class="alert-success"> Enquiry by ${formData.name} submitted successfully !!!</span>
        </c:if>
             </div>
        </div>
        </div>
    </body>
    
    <script>
    $( function() {
        $( "#dob" ).datepicker({dateFormat:'dd-mm-yy'});
        //$('#dob').datepicker('setDate', 'today');
    });
    
  
    </script>
</html>
