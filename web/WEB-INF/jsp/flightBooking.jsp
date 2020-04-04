<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight Booking</title>
        <jsp:include page="include.jsp"/>
        
   
         <style>
        .error{color:red}    
        </style>
    </head>
   
    <body>
    <div class="container">
        <div class="overlay"></div>
         <form:form id="flightBookingForm" action="flightBooking" method="post" modelAttribute="flightBean">
             <center> <h2 class="badge-info">Flight Reservation</h2></center>
           <br>
           <br>
             <span class="alert-danger">Fields marked with an asterisk(*) are mandatory</span>     
        
        <br>
        <br>
        <div class="form-row">
           
            <div class="col-sm-2">
                <strong> <label>*Customer Name:</label> </strong>
            </div>
            <div class="col-sm-3">
                <form:input path="name" class="form-control" placeholder="Enter Name"/>
            </div>
            <div class="col-sm-3">
                 <form:errors path="name" cssClass="error"/>
            </div>
        </div>
            
        <div class="form-row">
           
            <div class="col-sm-2">
                <strong> <label>*Origin</label> </strong>
            </div>
            <div class="col-sm-3">
                <form:select path="fromCountry" class="form-control" >
                    <form:option value="0" label="Select Origin Country"/>
                    <form:options items="${flightBean.countryList}"/>
                </form:select>
            </div>
            <div class="col-sm-3">
                <form:errors path="fromCountry" cssClass="error"/>
            </div>
        </div>
            
         <div class="form-row">
           
            <div class="col-sm-2">
                <strong> <label>*Destination:</label> </strong>
            </div>
            <div class="col-sm-3">
                 <form:select path="toCountry" class="form-control" >
                    <form:option value="0" label="Select Destination Country"/>
                    <form:options items="${flightBean.countryList}"/>
                </form:select>
            </div>
            <div class="col-sm-3">
                <form:errors path="toCountry" cssClass="error"/>
            </div>
        </div>
            
             <div class="form-row">
           
            <div class="col-sm-2">
                <strong> <label>*Mobile No:</label> </strong>
            </div>
            <div class="col-sm-3">
                <form:input path="mobileNo" class="form-control" placeholder="Enter Mobile No"/>
            </div>
            <div class="col-sm-3">
                <form:errors path="mobileNo" cssClass="error"/>
            </div>
        </div>
            
             <div class="form-row">
           
            <div class="col-sm-2">
                <strong> <label>*Frequent Flyer:</label> </strong>
            </div>
            <div class="col-sm-3">
                <form:input path="frequentFlyer" class="form-control" placeholder="Enter FF No."/>
            </div>
            <div class="col-sm-3">
                <form:errors path="frequentFlyer" cssClass="error"/>
            </div>
        </div>
            <br>
            <input type="submit" value="Submit" class="btn btn-success"/>
            
         </form:form>
        <br>
        <br>
        <br>
        <c:if test="${status=='final'}">
            <span class="alert-success">Flight booked successfully for ${flightBean.name}</span>
        </c:if>
    </div>
    
    
    </body>
    
</html>
