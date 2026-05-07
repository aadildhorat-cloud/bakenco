/**
🍫 Bake & Co. - Centralized Product Data & Utilities
📁 Recommended Path: /bakenco/js/products-bakenco.js
🔗 Usage: Include this exact script on BOTH Hive Times & Bake & Co. pages.
✅ Edit the RAW_PRODUCTS array below → Auto-syncs across all linked sites.
*/
(function () {
  // 📌 ASSET CONFIGURATION
  const CONFIG = {
    basePath: "/bakenco",
    imageDir: "/images",
    fallbackImage: "/images/bakenco-logo.png",
    businessName: "Bake & Co.",
    businessLogo: "/images/bakenco-logo.png"
  };

  // 📦 RAW PRODUCT DATA - ✏️ EDIT THIS ARRAY TO UPDATE EVERYWHERE
  const RAW_PRODUCTS = [
    // === 🍣 DESSERT SUSHI COLLECTION ===
    { id: "biscoff-bliss-sushi", name: "Biscoff Bliss Sushi", price: 60.00, category: "dessert-sushi", niche: "food-beverages", location: "gauteng", description: "Soft crepes filled with rich brownie, topped with Biscoff drizzle. 3 pieces", badge: "✨ Popular", image: "biscoff-sushi.jpg" },
    { id: "chocolate-overload-sushi", name: "Chocolate Overload Sushi", price: 60.00, category: "dessert-sushi", niche: "food-beverages", location: "gauteng", description: "Brownie-filled crepes smothered in chocolate sauce. 3 pieces", badge: "🍫 Best Seller", image: "chocolate-sushi.jpg" },
    { id: "bar-one-dream-sushi", name: "Bar One Dream Sushi", price: 65.00, category: "dessert-sushi", niche: "food-beverages", location: "gauteng", description: "Filled with brownie & topped with creamy Bar One sauce. 3 pieces", badge: "🔥 Hot", image: "barone-sushi.jpg" },
    { id: "oreo-crunch-sushi", name: "Oreo Crunch Sushi", price: 65.00, category: "dessert-sushi", niche: "food-beverages", location: "gauteng", description: "Brownie crepes topped with crushed Oreos & chocolate drizzle. 3 pieces", badge: "", image: "oreo-sushi.jpg" },
    { id: "nutella-fantasy-sushi", name: "Nutella Fantasy Sushi", price: 65.00, category: "dessert-sushi", niche: "food-beverages", location: "gauteng", description: "Creamy Nutella filled & drizzled to perfection. 3 pieces", badge: "✨ Premium", image: "nutella-sushi.jpg" },

    // === 🍰 EXTRAS ===
    { id: "extra-sauce", name: "Extra Sauce (Chocolate/Biscoff/Bar One)", price: 10.00, category: "extras", niche: "food-beverages", location: "gauteng", description: "Add extra sauce to your order", badge: "", image: "extra-sauce.jpg" },
    { id: "crushed-toppings", name: "Crushed Toppings (Oreo/Biscoff)", price: 10.00, category: "extras", niche: "food-beverages", location: "gauteng", description: "Add crushed toppings to your order", badge: "", image: "toppings.jpg" },

    // === 🍪 CRUMBLE COOKIES ===
    { id: "choc-chip-cookie", name: "Choc Chip Cookie", price: 18.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Classic chocolate chip cookie", badge: "🍪 Classic", image: "chocchip-cookie.jpg" },
    { id: "smores-cookie", name: "Smores Cookie", price: 25.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Graham cracker, chocolate & marshmallow cookie", badge: "", image: "smores-cookie.jpg" },
    { id: "red-velvet-cookie", name: "Red Velvet Cookie", price: 25.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Rich red velvet flavored cookie", badge: "❤️ Popular", image: "redvelvet-cookie.jpg" },
    { id: "nutella-stuffed-cookie", name: "Nutella Stuffed Cookie", price: 30.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Cookie stuffed with creamy Nutella", badge: "✨ Premium", image: "nutella-cookie.jpg" },
    { id: "death-by-chocolate", name: "Death By Chocolate", price: 35.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Ultimate chocolate lover's cookie", badge: "🍫 Best Seller", image: "deathbychoc-cookie.jpg" },
    { id: "pink-sugar-cookie", name: "Pink Sugar Cookie", price: 20.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Sweet pink sugar cookie", badge: "", image: "pinksugar-cookie.jpg" },
    { id: "salted-caramel-cookie", name: "Salted Caramel Cookie", price: 30.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Salted caramel filled cookie", badge: "🔥 Hot", image: "saltedcaramel-cookie.jpg" },
    { id: "kinder-bueno-cookie", name: "Kinder Bueno Cookie", price: 35.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Kinder Bueno inspired cookie", badge: "✨ Premium", image: "kinderbueno-cookie.jpg" },
    { id: "matcha-cookie", name: "Matcha Cookie", price: 25.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Green tea matcha flavored cookie", badge: "", image: "matcha-cookie.jpg" },
    { id: "churro-cookie", name: "Churro Cookie", price: 20.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Cinnamon churro inspired cookie", badge: "", image: "churro-cookie.jpg" },
    { id: "m&m-cookie", name: "M&M Cookie", price: 20.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Cookie loaded with M&Ms", badge: "", image: "mm-cookie.jpg" },
    { id: "smarties-cookie", name: "Smarties Cookie", price: 20.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Cookie loaded with Smarties", badge: "", image: "smarties-cookie.jpg" },
    { id: "birthday-cake-cookie", name: "Birthday Cake Cookie", price: 20.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Funfetti birthday cake cookie", badge: "🎂 Special", image: "birthdaycake-cookie.jpg" },
    { id: "lemon-cream-cookie", name: "Lemon Cream Cookie", price: 20.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Zesty lemon cream cookie", badge: "", image: "lemon-cookie.jpg" },
    { id: "choc-chip-cookie-dough", name: "Choc Chip Cookie Dough", price: 25.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Edible chocolate chip cookie dough", badge: "", image: "cookiedough-cookie.jpg" },
    { id: "oreo-cookie", name: "Oreo Cookie", price: 25.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Oreo stuffed cookie", badge: "", image: "oreo-cookie.jpg" },
    { id: "confetti-cookie", name: "Confetti Cookie", price: 20.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Colorful confetti cookie", badge: "", image: "confetti-cookie.jpg" },
    { id: "pecan-pie-cookie", name: "Pecan Pie Cookie", price: 25.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Pecan pie inspired cookie", badge: "", image: "pecan-cookie.jpg" },
    { id: "biscoff-cookie", name: "Biscoff Cookie", price: 35.00, category: "crumble-cookies", niche: "food-beverages", location: "gauteng", description: "Lotus Biscoff flavored cookie", badge: "✨ Premium", image: "biscoff-cookie.jpg" },

    // === 🍫 BROWNIES ===
    { id: "brookie", name: "Brookie", price: 20.00, category: "brownies", niche: "food-beverages", location: "gauteng", description: "Brownie cookie hybrid", badge: "", image: "brookie.jpg" },
    { id: "nutty-brownie", name: "Nutty Brownie", price: 25.00, category: "brownies", niche: "food-beverages", location: "gauteng", description: "Brownie loaded with nuts", badge: "", image: "nutty-brownie.jpg" },
    { id: "plain-brownie", name: "Plain Brownie", price: 20.00, category: "brownies", niche: "food-beverages", location: "gauteng", description: "Classic chocolate brownie", badge: "🍫 Classic", image: "plain-brownie.jpg" },
    { id: "cookie-dough-brownie", name: "Cookie Dough Brownie", price: 25.00, category: "brownies", niche: "food-beverages", location: "gauteng", description: "Brownie topped with cookie dough", badge: "🔥 Hot", image: "cookiedough-brownie.jpg" }
  ];

  // 🔄 Process & Attach Metadata
  const PROCESSED = RAW_PRODUCTS.map(product => ({
    ...product,
    image: `${CONFIG.basePath}${CONFIG.imageDir}/${product.image}`,
    imageFallback: `${CONFIG.basePath}${CONFIG.fallbackImage}`,
    businessName: product.businessName || CONFIG.businessName,
    businessLogo: `${CONFIG.basePath}${CONFIG.fallbackImage}`,
    categorySlug: product.category.trim().toLowerCase(),
    nicheSlug: product.niche?.trim().toLowerCase() || "food-beverages",
    locationSlug: product.location?.trim().toLowerCase() || "gauteng"
  }));

  // 🌐 Global Export
  window.BAKE_N_CO_PRODUCTS = PROCESSED;
  window.BAKENCO_DATA = PROCESSED;

  // 🛠️ Utility API
  window.BakeNCoProducts = {
    getAll: () => window.BAKE_N_CO_PRODUCTS,
    getById: (id) => window.BAKE_N_CO_PRODUCTS.find(p => p.id === id),
    getByCategory: (category) => window.BAKE_N_CO_PRODUCTS.filter(p => p.categorySlug === category.toLowerCase()),
    getByLocation: (location) => window.BAKE_N_CO_PRODUCTS.filter(p => p.locationSlug === location.toLowerCase()),
    getByNiche: (niche) => window.BAKE_N_CO_PRODUCTS.filter(p => p.nicheSlug === niche.toLowerCase()),
    filter: ({ category, location, niche }) => window.BAKE_N_CO_PRODUCTS.filter(p => {
      if (category && p.categorySlug !== category.toLowerCase()) return false;
      if (location && p.locationSlug !== location.toLowerCase()) return false;
      if (niche && p.nicheSlug !== niche.toLowerCase()) return false;
      return true;
    }),
    
    renderCard: (p) => `
      <article class="product-card" 
               data-id="${p.id}" 
               data-category="${p.categorySlug}" 
               data-price="${p.price}"
               data-name="${p.name}"
               data-description="${p.description}"
               data-image="${p.image}"
               data-niche="${p.nicheSlug}"
               data-location="${p.locationSlug}">
        
        <div class="product-image-wrap" onclick="openProductModal('${p.id}')">
          <img 
            src="${p.image}" 
            alt="${p.name}" 
            loading="lazy" 
            class="product-image"
            onerror="this.src='${p.imageFallback}'">
          ${p.badge ? `<span class="product-badge">${p.badge}</span>` : ''}
        </div>
        
        <div class="product-info">
          <h3 class="product-name">${p.name}</h3>
          <p class="product-description">${p.description}</p>
          <div class="product-price">R${p.price.toFixed(2)}</div>
          
          <button 
            class="add-to-cart-btn" 
            onclick="event.stopPropagation(); cart.addToCart({
              id: '${p.id}', 
              name: '${p.name}', 
              price: ${p.price}, 
              quantity: 1, 
              image: '${p.image}',
              businessName: '${p.businessName}',
              businessLogo: '${p.businessLogo}'
            }); showToast('✅ ${p.name} added to cart!');">
            <i class="fas fa-shopping-cart"></i> Add to Cart
          </button>
        </div>
      </article>
    `,
    
    getWhatsAppLink: (product, phoneNumber = "27670527209") => {
      const msg = encodeURIComponent(
        `Hi! I'd like to order from Bake & Co.:\n\n` +
        `🍫 *${product.name}*\n` +
        `💰 Price: R${product.price.toFixed(2)}\n` +
        `📝 ${product.description}\n\n` +
        `Please confirm availability. Thank you!`
      );
      return `https://wa.me/${phoneNumber}?text=${msg}`;
    }
  };

  // 📊 Dev Console
  console.group("🍫 Bake & Co. Products Synced");
  console.log(`✅ ${PROCESSED.length} products loaded`);
  const grouped = {};
  PROCESSED.forEach(p => {
    grouped[p.categorySlug] = grouped[p.categorySlug] || [];
    grouped[p.categorySlug].push(p.name);
  });
  Object.entries(grouped).forEach(([cat, items]) => 
    console.log(`📁 ${cat}: ${items.length} item(s)`)
  );
  console.groupEnd();
})();