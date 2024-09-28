async function sendForm() {
    const nome = document.getElementById('nome').value;
    const birthdate = document.getElementById('birthdate').value;

    const gender = document.getElementById('gender').value;
    const maritalStatus = document.getElementById('marital-status').value;
    const educationLevel = document.getElementById('education-level').value;
    const language = document.getElementById('language').value;
    const area = document.getElementById('area').value;
    const library = document.getElementById('library').value;
    const ide = document.getElementById('ide').value;
    const practice = document.getElementById('practice').value;

    const formData = new URLSearchParams();
    formData.append('nome', nome);
    formData.append('birthdate', birthdate);
    formData.append('gender', gender);
    formData.append('marital-status', maritalStatus);
    formData.append('education-level', educationLevel);
    formData.append('language', language);
    formData.append('area', area);
    formData.append('library', library);
    formData.append('ide', ide);
    formData.append('practice', practice);

    try {
        const response = await fetch('http://localhost:8080/SiteTDE/formulario', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            },
            body: formData
        });

        if (response.ok) {
            alert("Form sent successfully!");
        } else {
            alert("An error occured when submitting the form. Please try again.");
        }
    } catch (error) {
        console.error('Error sending form:', error);
        alert("An error occured when submitting the form. Please try again.");
    }
}
