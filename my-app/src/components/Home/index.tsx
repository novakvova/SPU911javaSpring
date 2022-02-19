import * as React from 'react';
import CropperModal from '../common/CropperModal';
import { Col, Row } from "antd";

const HomePage : React.FC = () => {

  const handleSelected = async (base64: string) => {
    console.log("Select "+ base64);
    //const imgName = await http.post<string>("upload", {base64: base64});
    //console.log(imgName.data);
    
    //setImages([...images,urlBackend+"files/"+imgName.data]);
  };


    return (
      <>
        <h1>Головна сторінка</h1>
        <Row gutter={[8, 8]}>

        <Col md={4}>
          <div>
            <CropperModal onSelected={handleSelected} aspectRation={16 / 9} />
          </div>
        </Col>
      </Row>
        

      </>
    );
}

export default HomePage;