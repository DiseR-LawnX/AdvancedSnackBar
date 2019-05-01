![](https://jitpack.io/v/DiseR-LawnX/AdvancedSnackBar.svg)
# AdvancedSnackBar

### Introduction:
The advanced addon on SnackBar
Use Google's latest Material Design 2.0 style.

### Useage:
1.Compile it on your project:

(Project)build.gradle:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
(app)build.gradle:
```
dependencies {
	        implementation 'com.github.DiseR-LawnX:AdvancedSnackBar:0.1.0'
	}
```

2.Code:
```
final CoordinatorLayout contaier = findViewById(R.id.container);
FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdvancedSnackBar snackbar = new AdvancedSnackBar();
                snackbar.make(contaier,AdvancedSnackBar.LENGTH_LONG,MainActivity.this);
                snackbar.setDesign(AdvancedSnackBar.DESIGN_MATERIAL);
				/*DESIGN_MATERIAL:Material Design 2.0 Style
				DESIGN_ORINIGAL: Orinigal Style*/
                snackbar.setText("This is a Snackbar");
                snackbar.setBackgroundColor("#000000");
                snackbar.setTextSize(18);
                snackbar.setElevation(4.0f);
                snackbar.addButton("Button", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Any Code
                    }
                });
                snackbar.setBackgroundDrawable(R.drawable.design_snackbar_material_background);
                snackbar.setMargin(12,12,12,12);
                snackbar.show();
            }
        });
```

### Preview:
![preview](https://raw.githubusercontent.com/DiseR-LawnX/AdvancedSnackBar/master/image/screenshot_01.png)

Thanks for your use enjoy it!
