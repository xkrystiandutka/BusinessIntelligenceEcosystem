# Business Intelligence Ecosystem based on Big Data environments  
## Purpose and scope of the work
The presented engineering work aims to demonstrate the key features of the concept of building a business intelligence ecosystem architecture using Big Data. The ecosystem was created for data processing, visualization and analysis. The concepts presented in the theoretical part were used to implement the architecture design. The theoretical introduction considers four aspects:
- ways of processing data,
- construction of the Big Data architecture,
- presentation of the Apache Spark environment,
- Business Intelligence concept and data visualization tools.

In order to demonstrate the use of Business Intelligence technology, the practical part is divided into 3 stages of building the ecosystem. These stages are the necessary steps so that a proper ecosystem can be built. For the purpose of testing the given architecture, it was implemented for the Advenutre Works enterprise. The construction of the presented concept in the theoretical part was divided respectively into:
- Creating the ecosystem assumptions and business justifications for its implementation. Presentation of the existing state of the enterprise, identification of data sources and requirements for their processing.
- Preparing the architecture, along with the technologies used to execute it so that it meets the stated objectives. Basing it on the data processing layer in Apache Spark and the data visualization layer in the Power Bi environment.
- Presentation of the implementation of the created architecture to Advenutre Works. Preparing the data flow in the Apache Spark environment and building an interactive application based on four dashboards for business analysts on the Power Bi platform. Visualization through charts and reports of historical data, the analysis of which helped to optimize the Adventure Works enterprise.

The project realized the assumptions listed below:
- business case for establishing the project,
- identification of data sources,
- identification of initial requirements,
- identification of end requirements,
- architecture with technology selection,
- description of the implementation of a given architecture.

The thesis includes a detailed theoretical description and a practical part in which the described ecosystem architecture was created and implemented in the company Advenutre Works. The ecosystem architecture includes:
- Apache Spark as a mass data processing engine,
- Hadoop Distributed File System for data storage,
- Apache Druid for data sharing,
- Power Bi as a platform for creating visualizations and data reporting.
- An interactive application for users and business analysts to analyze Advenutre Works enterprise data has been created in Power BI.

The ecosystem provides 4 dashboards in which the business analyst can analyze:
- the number of orders by categories and subcategories,
- the number of returns of ordered products,
- the turnover, costs and earnings of the company over time,
- the amount of products sold in different continents and specific countries,
- realization of earnings targets, sales targets and reduction of product complaints,
- achievement of targets in specific months,
- weekly profit with a forecast for the future,
- type of color of products sold,
- customers in relation to the number of orders and the money they leave at the company when buying products,
- the influence of gender, age, etc. on the number of orders that a customer makes,
- the best products in relation to the amount of sales and profits they generate for the company,
- trends in product sales over the years.

The created ecosystem design can be expanded to create a real-time processing layer, which would be responsible for analyzing data coming directly from sensors. The architecture of the ecosystem was created with the concept that in the future it can be expanded to include the previously mentioned layer.
The stated goal of the thesis was fully achieved. An architecture of a Business Intelligence ecosystem using Big Data has been created, which can be used as a point of presentation of architecture concepts for architects and designers responsible for their construction.

## Business Intelligence Ecosystem architecture based on Big Data environments 
![Ecosystem](https://user-images.githubusercontent.com/89588699/217612107-c843dc58-82e3-4950-9f46-f39282951e2e.png)
## Raw Data in Apache Spark
![image](https://user-images.githubusercontent.com/89588699/217612613-dbaa1f21-a182-41f9-a05b-d1f358384b7e.png)
## Relationships between processed Adventure works databases in Power Bi
![image](https://user-images.githubusercontent.com/89588699/217612693-451e8bb9-7d39-45cf-b000-0b5f89f3d11e.png)
## Interactive application with 4 dashboards for business analysts
### Visualize general company data for Advenuture Works
![image](https://user-images.githubusercontent.com/89588699/217614664-4f7995fd-2483-4abb-8f19-0749a430c7a5.png)

### Data visualization concern company products for Advenuture Works
![image](https://user-images.githubusercontent.com/89588699/217614703-296fade4-779d-4e85-8cc6-31faf042e4d3.png)

### Data visualization concern Advenuture Works customers
![image](https://user-images.githubusercontent.com/89588699/217614756-e286eb61-5277-4fdc-bb1c-8fabb5296c63.png)

### Region-specific data visualization and sales prediction for Adventure Works 
![image](https://user-images.githubusercontent.com/89588699/217614791-21cb3c3a-9fea-4465-ac70-8e95f2bca552.png)


## LICENSE

GNU General Public License, version 3 (GPLv3)
- The source code must be made public whenever a distribution of the software is made.
- Modifications of the software must be released under the same license.
- Changes made to the source code must be documented.
- If patented material was used in the creation of the software, it grants the right for users to use it. If the user sues anyone over the use of the patented material, they lose the right to use the software.
