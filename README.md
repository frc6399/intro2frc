# intro2frc

## Environment Setup

### Install Node.js and npm

1. Visit [Node.js official website](https://nodejs.org/)
2. Download LTS version (recommended)
3. Run installer with default options
4. After installation, open terminal/command prompt and verify:

```bash
node -v  # Shows version if successful
npm -v   # Shows version if successful
```

## Quick Start

### 1. Install Project Dependencies

```bash
npm install
```

### 2. Local Development

```bash
npm run dev
```

Then visit: http://localhost:5173

### 3. Deploy to GitHub

1. Push code to GitHub repository
2. Enable GitHub Pages in repository settings
3. Automatic deployment occurs on every push to main branch

## Adding New Pages

### Step 1: Create Markdown File

Create `.md` file in `docs` directory:

```
docs/
├── guide/
│   └── new-page.md     # New page
└── index.md           # Home page
```

### Step 2: Configure Routes

Edit `docs/.vitepress/config.mts`:

```typescript
export default {
  themeConfig: {
    sidebar: [
      {
        text: "Guide",
        items: [
          { text: "New Page", link: "/guide/new-page" },
          // Other pages...
        ],
      },
    ],
  },
};
```

### Step 3: Reference from Other Pages

Use links in Markdown files:

```markdown
[View New Page](/guide/new-page)
```

## Managing Static Assets

### Images

1. Place images in `docs/public` directory
2. Reference in Markdown:

```markdown
![Image Description](/image-name.jpg)
```

### File Structure

```
docs/
├── public/           # Static assets directory
│   ├── image1.jpg
│   └── logo.png
├── guide/           # Documentation pages
└── .vitepress/      # Configuration files
    └── config.mts   # Theme configuration
```

## Common Commands

```bash
npm run dev          # Start development server
npm run build        # Build production version
npm run preview      # Preview build result
```

## Learning Resources

- [VitePress Official Documentation](https://vitepress.dev/)
- [Markdown Syntax Guide](https://www.markdownguide.org/)
- [npm Usage Guide](https://docs.npmjs.com/)

## Important Notes

- Use UTF-8 encoding for all Markdown files
- Use WebP or JPEG format for images to optimize loading speed
- Test locally with `npm run build` before pushing code to ensure no errors
