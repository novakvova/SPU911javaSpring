import * as React from 'react';
import { Outlet } from 'react-router-dom';
import './index.css';

const DefaultLayout : React.FC = () => {
    return (
        <>
            <h2>Заголовок сторінки</h2>
            <Outlet/>
        </>
    );
}

export default DefaultLayout;