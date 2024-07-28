<h1>🌍 Journey Project</h1>

<h2>About the Project</h2>
<blockquote>
    <p>The Journey project aims to help users organize trips for work or leisure. Users can create a trip with a name, start and end date. Within the trip, users can plan their trip by adding activities to carry out each day.</p>
</blockquote>

<h2>🛠️ Tools</h2>
<ul>
    <li>Spring Web</li>
    <li>Flyway</li>
    <li>DevTools</li>
    <li>Lombok</li>
    <li>JPA</li>
    <li>H2 Database</li>
</ul>

<h2>📋 Requirements</h2>

<h3>Functional Requirements</h3>
<ol>
    <li>Users register a trip by informing the destination location, start date, end date, guests' emails, and their full name and email address.</li>
    <li>The trip creator receives an email to confirm the new trip via a link. Upon clicking the link, the trip is confirmed, guests receive attendance confirmation emails, and the creator is redirected to the trip page.</li>
    <li>Guests, when clicking on the attendance confirmation link, are redirected to the application where they must enter their name (in addition to the pre-filled email) and are then confirmed on the trip.</li>
    <li>On the event page, trip participants can add important travel links such as Airbnb reservations, places to visit, etc.</li>
    <li>On the event page, the creator and guests can add activities that will occur during the trip with title, date, and time.</li>
    <li>New participants can be invited within the event page via email and must go through the confirmation flow like any other guest.</li>
</ol>

<h2>🚀 How to Run the Project Locally</h2>
<ol>
    <li><strong>Clone the repository:</strong>
        <pre><code>git clone https://github.com/your-username/your-repository.git
        cd your-repository</code></pre>
    </li>
    <li><strong>Set up the database:</strong>
        <p>The project uses H2 Database, which is an in-memory database. No additional setup is required.</p>
    </li>
    <li><strong>Configure the application:</strong>
        <p>Ensure you have the necessary configurations in <code>application.properties</code> or <code>application.yml</code>.</p>
    </li>
    <li><strong>Run the application:</strong>
        <p>You can run the application using your IDE (e.g., IntelliJ IDEA, Eclipse) or via the command line:</p>
        <pre><code>./mvnw spring-boot:run</code></pre>
    </li>
    <li><strong>Access the application:</strong>
        <p>Once the application is running, you can access it at <a href="http://localhost:8080">http://localhost:8080</a>.</p>
    </li>
    <li><strong>Flyway Migrations:</strong>
        <p>Flyway will automatically run the database migrations on application startup.</p>
    </li>
</ol>

<h2>📄 License</h2>
<p>This project is licensed under the Apache License 2.0 - see the <a href="LICENSE">LICENSE</a> file for details.</p>
