<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <div class="container">
        <div class="carousel">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>

                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="images/slide1.jpg" class="d-block w-100">
                    </div>
                    <div class="carousel-item">
                        <img src="images/slide2.jpg" class="d-block w-100">
                    </div>
                    <div class="carousel-item">
                        <img src="images/slide3.jpg" class="d-block w-100">
                    </div>
                </div>

                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button"
                    data-slide="prev"> <span class="carousel-control-prev-icon"
                    aria-hidden="true"></span> <span class="sr-only">Previous</span>
                </a> <a class="carousel-control-next" href="#carouselExampleIndicators" role="button"
                    data-slide="next"> <span class="carousel-control-next-icon"
                    aria-hidden="true"></span> <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </div>
