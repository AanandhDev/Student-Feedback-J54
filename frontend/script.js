const form = document.getElementById("feedbackForm");

form.addEventListener("submit", function (e) {

    e.preventDefault();

    const feedbackData = {

        name: document.getElementById("name").value,

        email: document.getElementById("email").value,

        course: document.getElementById("course").value,

        rating: document.getElementById("rating").value,

        feedback: document.getElementById("feedback").value

    };

    fetch ("http://localhost:8080/api/feedback", {

        method: "POST",

        headers : {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(feedbackData)
        
    })
        .then(response => response.json())
        .then(data => {    
            console.log("Feedback submitted successfully:", data);
            alert("Feedback submitted successfully!");
        })
        .catch(error => {
            console.error("Error submitting feedback:", error);
            alert("Failed to submit feedback.");
        })


});