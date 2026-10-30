# Day 15 – HTML Forms, Navigation and Multimedia

**UPS Java Full Stack Training**

## 1. Overview

Day 15 focuses on HTML navigation, forms, multimedia elements and other essential HTML components. The practical exercises include creating registration and login pages, developing a multi-page website and exploring individual HTML examples.

## 2. Topics Covered

- Anchor Tags and Hyperlinks
- Anchor Target Attributes
- HTML Iframes and Named Frames
- Marquee Tag and Attributes
- HTML Entities
- Video and Audio Elements
- HTML Form Elements and Input Types
- Tables and Lists
- Dropdown Lists
- Multi-Page Website Navigation

## 3. Practical Exercises

### Exercise 1 – Registration Page

**Objective:** Create a registration form to collect user details.

Fields included:
- Name
- Email ID
- Phone Number
- Address
- Submit and Reset buttons

**Source Code:** [register.html](Navbar/register.html)

### Exercise 2 – Login Page

**Objective:** Create a login form using HTML form elements.

Fields included:
- Username
- Password
- Login button
- Reset button

**Source Code:** [login.html](Navbar/login.html)

### Exercise 3 – Multi-Page Website

**Objective:** Create a website with multiple pages connected through a navigation bar.

**Navigation Menu:**
- Home
- About
- Contact
- Login
- Register

| Page | Description | Source Code |
|---|---|---|
| Home | Main page with navigation menu | [home.html](Navbar/home.html) |
| About | Website information | [about.html](Navbar/about.html) |
| Contact | Contact information | [contact.html](Navbar/contact.html) |
| Login | User login form | [login.html](Navbar/login.html) |
| Register | User registration form | [register.html](Navbar/register.html) |

## 4. HTML Concepts and Practicals

### 4.1 Anchor Tags and Target Attributes

The `<a>` tag creates hyperlinks to navigate between webpages.

| Target | Description |
|---|---|
| `_self` | Opens the link in the same tab or frame |
| `_blank` | Opens the link in a new tab |
| `_parent` | Opens the link in the parent frame |
| `_top` | Opens the link in the full browser window |
| Named Target | Opens the link inside a named iframe |

**Practical:** [anchor-targets.html](examples/anchor-targets.html)

### 4.2 Iframes

The `<iframe>` element embeds another webpage inside the current webpage.

| Attribute | Description |
|---|---|
| `src` | Specifies the webpage to embed |
| `width` | Sets the iframe width |
| `height` | Sets the iframe height |
| `name` | Assigns a name to the iframe |
| `frameborder` | Legacy attribute for controlling the iframe border |

**Practical:** [anchor-targets.html](examples/anchor-targets.html)

### 4.3 Marquee Tag

The `<marquee>` tag creates scrolling text or content.

| Attribute | Description |
|---|---|
| `behavior` | Defines scrolling, sliding or alternate movement |
| `direction` | Specifies the scrolling direction |
| `height` | Sets the marquee height |
| `width` | Sets the marquee width |
| `scrollamount` | Controls scrolling speed |
| `scrolldelay` | Sets the delay between movements |
| `loop` | Specifies the number of repetitions |

**Practical:** [marquee.html](examples/marquee.html)

### 4.4 HTML Entities

HTML entities are special codes used to display reserved characters, symbols and currency signs in HTML.

| Entity Code | Display Output | Description |
|---|---|---|
| `&nbsp;` | Non-breaking space | Adds a non-breaking space |
| `&lt;` | &lt; | Less than sign |
| `&gt;` | &gt; | Greater than sign |
| `&amp;` | &amp; | Ampersand |
| `&quot;` | &quot; | Double quotation mark |
| `&apos;` | &apos; | Apostrophe |
| `&copy;` | &copy; | Copyright symbol |
| `&reg;` | &reg; | Registered trademark |
| `&euro;` | &euro; | Euro symbol |
| `&pound;` | &pound; | Pound symbol |
| `&yen;` | &yen; | Yen symbol |
| `&cent;` | &cent; | Cent symbol |
| `&trade;` | &trade; | Trademark symbol |

**Practical:** [entities.html](examples/entities.html)

### 4.5 Multimedia Elements

HTML supports embedding video and audio directly into webpages.

**Video attributes:**
- `controls` – Displays video controls.
- `muted` – Mutes the video.
- `autoplay` – Attempts to play automatically.
- `loop` – Repeats the video.
- `width` and `height` – Set video dimensions.

**Audio attributes:**
- `controls` – Displays audio controls.
- `autoplay` – Attempts to play automatically.
- `loop` – Repeats the audio.

YouTube videos can also be embedded using an `<iframe>`.

**Practical:** [multimedia.html](examples/multimedia.html)

### 4.6 HTML Forms and Input Types

HTML forms collect information from users.

| Input Type | Purpose |
|---|---|
| `text` | Accepts text |
| `password` | Accepts passwords |
| `number` | Accepts numbers |
| `email` | Accepts email addresses |
| `tel` | Accepts telephone numbers |
| `date` | Selects a date |
| `datetime-local` | Selects date and time |
| `checkbox` | Allows multiple selections |
| `radio` | Allows one selection from a group |
| `file` | Selects a file |
| `range` | Provides a slider |
| `url` | Accepts a website URL |
| `submit` | Submits a form |
| `reset` | Resets form values |

**Other form elements:**

| Element / Attribute | Purpose |
|---|---|
| `<label>` | Defines an input label |
| `<textarea>` | Accepts multi-line text |
| `<select>` | Creates a dropdown |
| `<option>` | Defines dropdown choices |
| `placeholder` | Displays input guidance |
| `required` | Makes a field mandatory |

**Practicals:**
- [Login Form](Navbar/login.html)
- [Registration Form](Navbar/register.html)

### 4.7 Tables, Lists and Dropdowns

- **Tables:** Organize data using `<table>`, `<tr>`, `<th>` and `<td>`.
- **Ordered Lists:** Display numbered items using `<ol>` and `<li>`.
- **Unordered Lists:** Display bullet points using `<ul>` and `<li>`.
- **Description Lists:** Display terms and descriptions using `<dl>`, `<dt>` and `<dd>`.
- **Dropdown Lists:** Create selectable options using `<select>` and `<option>`.

**Practical:** [tables-lists-dropdown.html](examples/tables-lists-dropdown.html)

## 5. Project Structure

```text
Day-15/
│
├── examples/
│   ├── anchor-targets.html
│   ├── entities.html
│   ├── marquee.html
│   ├── multimedia.html
│   ├── sample-audio.mp3
│   ├── sample-video.mp4
│   └── tables-lists-dropdown.html
│
├── Navbar/
│   ├── about.html
│   ├── contact.html
│   ├── home.html
│   ├── login.html
│   └── register.html
│
└── readme.md
```

## 6. How to Run

1. Clone or download the repository.
2. Open the project folder in Visual Studio Code.
3. Open the `Navbar` folder.
4. Run `home.html` in a browser.
5. Use the navigation menu to access Home, About, Contact, Login and Register pages.
6. Open the HTML files inside the `examples` folder to explore individual concepts.

## 7. Important Notes

- The `<marquee>` tag is obsolete and is used only for practice.
- The older `<frame>` and `<frameset>` elements are obsolete in HTML5. Use `<iframe>` for embedding webpages.
- Add `sample-video.mp4` and `sample-audio.mp3` to the `examples` folder to test multimedia playback.
- Replace `VIDEO_ID` in the YouTube iframe with a valid YouTube video ID.
- Autoplay may be restricted by browsers. Muted autoplay is generally more likely to work.
- Registration and login forms are HTML practice exercises only. They do not provide actual authentication or save user details because no backend is connected.

## 8. Key Learnings

- Practiced hyperlinks and anchor target attributes.
- Learned to embed webpages using iframes.
- Explored marquee attributes and scrolling behaviour.
- Used HTML entities to display special characters.
- Embedded video and audio content.
- Practiced different HTML form elements and input types.
- Created registration and login forms.
- Developed a multi-page website with navigation.
- Practiced HTML tables, lists and dropdowns.

## 9. Conclusion

Successfully practiced HTML navigation, forms, iframes, entities, multimedia, tables and lists. Developed registration and login pages along with a multi-page website as part of Day 15 of UPS Java Full Stack Training.