import { QueryClient, QueryClientProvider } from '@tanstack/react-query';
import { ReactQueryDevtools } from '@tanstack/react-query-devtools';
import UserPostList from 'components/post/UserPostList';
import { GuestBook, Introduce } from 'pages/UserPage/components';
import { Outlet, RouterProvider, createBrowserRouter } from 'react-router-dom';
import { Layout } from './components/layout';
import {
    LoginPage,
    MainPage,
    ManagePage,
    PostDetailPage,
    PostWritePage,
    SignupPage,
    UserPage,
} from './pages';

const queryClient = new QueryClient();

const router = createBrowserRouter([
    {
        path: '/',
        element: <Layout />,
        children: [
            { index: true, element: <MainPage /> },
            { path: 'manage', element: <ManagePage /> },
            { path: 'post/:sort?', element: <MainPage /> },
            {
                path: ':userId',
                element: <UserPage />,
                children: [
                    { index: true, element: <UserPostList /> },
                    { path: 'posts', element: <UserPostList /> },
                    {
                        path: 'category/:categoryName?',
                        element: <UserPostList />,
                    },
                    { path: 'guestbook', element: <GuestBook /> },
                    { path: 'introduce', element: <Introduce /> },
                ],
            },
            {
                path: ':userId/:postId',
                element: <PostDetailPage />,
            },
        ],
    },
    {
        path: '/',
        element: <Outlet />,
        children: [
            { path: 'login', element: <LoginPage /> },
            { path: 'signup', element: <SignupPage /> },
            { path: 'write', element: <PostWritePage /> },
        ],
    },
]);

const App = () => (
    // react query를 router 내의 어디서든 쓸 수 있도록
    <QueryClientProvider client={queryClient}>
        <RouterProvider router={router} />
        <ReactQueryDevtools initialIsOpen={false} />
    </QueryClientProvider>
);

export default App;