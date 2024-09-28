<html>
<head>
    <link rel="stylesheet" type="text/css" href="index.css"/>
    <script defer src="index.js"></script>
</head>

<body>
<div class=page>
    <div class="title">Favorite Technology Things Questionnaire</div>

    <div class="form">
        <form id="form">
            <div class="form-left">
                <input type="text" name="nome" placeholder="Name" id="nome" >
                <input type="date" name="birthdate" placeholder="Birth date" id="birthdate">
                <select id="gender" name="gender">
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="non-binary">Non-Binary</option>
                    <option value="prefer-not-to-say">Prefer not to say</option>
                    <option value="other">Other</option>
                </select>
                <select id="marital-status" name="marital-status">
                    <option value="single">Single</option>
                    <option value="married">Married</option>
                    <option value="divorced">Divorced</option>
                    <option value="widowed">Widowed</option>
                    <option value="separated">Separated</option>
                    <option value="domestic-partnership">In a Domestic Partnership</option>
                </select>
                <select id="education-level" name="education-level">
                    <option value="no-formal-education">No Formal Education</option>
                    <option value="primary-education">Primary Education</option>
                    <option value="secondary-education">Secondary Education</option>
                    <option value="high-school-diploma">High School Diploma</option>
                    <option value="associate-degree">Associate Degree</option>
                    <option value="bachelor-degree">Bachelor's Degree</option>
                    <option value="master-degree">Master's Degree</option>
                    <option value="doctorate-degree">Doctorate Degree</option>
                    <option value="professional-degree">Professional Degree</option>
                </select>
            </div>

            <div class="form-right">
                <input type="text" name="language" placeholder="Favorite Programming Language" id="language">
                <input type="text" name="area" placeholder="Favorite Technology Area" id="area">
                <input type="text" name="library" placeholder="Favorite Programming Library" id="library">
                <input type="text" name="ide" placeholder="Favorite IDE" id="ide">
                <input type="text" name="practice" placeholder="Favorite Development Best Practice" id="practice">
            </div>
        </form>
    </div>

    <div class="div-button">
        <button type="button" class="button" onclick="sendForm()">Send</button>
    </div>
</div>
</body>
</html>