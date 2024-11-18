package com.example.mycitykr;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/landmarks")
public class CityLandmarksServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("""
                <!DOCTYPE html>
                <html lang="uk">
                <head>
                    <meta charset="UTF-8">
                    <title>Визначні пам’ятки Кривого Рогу</title>
                    <style>
                        body 
                        {
                            font-family: Arial, sans-serif;
                            line-height: 1.6;
                            margin: 20px;
                        }
                        nav 
                        {
                            background-color: #f4f4f4;
                            padding: 10px 20px;
                            margin-bottom: 20px;
                            display: flex;
                            justify-content: space-around;
                        }
                        nav a 
                        {
                            text-decoration: none;
                            color: #333;
                            font-weight: bold;
                            padding: 10px 15px;
                            border-radius: 5px;
                            transition: background-color 0.3s, color 0.3s;
                        }
                        nav a:hover 
                        {
                            background-color: #333;
                            color: white;
                        }
                        .gallery 
                        {
                            display: grid;
                            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
                            gap: 15px;
                            margin: 20px 0;
                        }
                        .gallery img 
                        {
                            width: 100%;
                            height: auto;
                            border-radius: 5px;
                        }
                        .links 
                        {
                            margin-top: 20px;
                        }
                        .links a 
                        {
                            display: block;
                            color: #007BFF;
                            text-decoration: none;
                            margin: 5px 0;
                            transition: color 0.3s;
                        }
                        .links a:hover 
                        {
                            color: #0056b3;
                        }
                    </style>
                </head>
                <body>
                    <nav>
                        <a href="/KRcity">Main Info</a>
                        <a href="/history">City History</a>
                        <a href="/hotels">Hotels</a>
                        <a href="/restaurants">Restaurants</a>
                        <a href="/restaurantDetails?id=1">re1</a>
                        <a href="/restaurantDetails?id=2">re2</a>
                        <a href="/hotelDetails?id=1">re3</a>
                        <a href="/hotelDetails?id=2">re4</a>
                    </nav>
                    <h1>Визначні пам’ятки Кривого Рогу</h1>
                    <p>Кривий Ріг має безліч унікальних пам’яток, які приваблюють туристів з різних куточків світу. 
                    Ось кілька найвідоміших місць, які варто відвідати:</p>
                    <ul>
                        <li>Парк ім. Газети "Правда" — мальовниче місце для прогулянок.</li>
                        <li>Скеля МОДРу — природний феномен із чарівним краєвидом.</li>
                        <li>Криворізький залізорудний басейн — найбільший у світі залізорудний кар’єр.</li>
                        <li>Центральний ринок — серце міста з автентичною атмосферою.</li>
                    </ul>                    
                    <h2>Фотографії пам’яток</h2>
                    <div class="gallery">
                        <img src="images/landmark1.jpg" alt="Парк Газети 'Правда'">
                        <img src="images/landmark2.jpg" alt="Скеля МОДРу">
                        <img src="images/landmark3.jpg" alt="Залізорудний басейн">
                        <img src="images/landmark4.jpg" alt="Центральний ринок">
                    </div>                  
                    <h2>Дізнайтеся більше</h2>
                    <div class="links">
                        <a href="https://www.tripadvisor.com/Attractions-g298049-Kryvyi_Rih_Dnipropetrovsk_Oblast.html" target="_blank">Туристичний путівник по Кривому Рогу</a>
                        <a href="https://uk.wikipedia.org/wiki/Кривий_Ріг" target="_blank">Визначні пам’ятки на Вікіпедії</a>
                    </div>
                </body>
                </html>
                """);
    }
}
