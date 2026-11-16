const contactForm = document.getElementById("contactForm");
const formStatus = document.getElementById("formStatus");

contactForm.addEventListener("submit", function (event) {
    event.preventDefault();

    const visitorName = document.getElementById("name").value.trim();
    formStatus.textContent = `Thank you, ${visitorName}. This is a demo form; no message was sent to a server.`;

    contactForm.reset();
});
