# alstrudat-c01-ifs23001

## Description

Program ini membuat simulasi dompet digital sederhana, di mana pengguna bisa:
A. Daftar akun (register)
B. Login sebagai:
-Admin (mengelola laporan & melihat daftar pengguna)
-User biasa (mengelola saldo: deposit, tarik tunai, transfer, dan melaporkan masalah)
-Semua data disimpan di memori menggunakan HashMap dan ArrayList.

## Source Codes

| No  | file               | Deskripsi         |
| --- | ------------------ | ----------------- |
| 1   | App.java           | Bawaan            |
| 2   | DompetService.java | melengkapi fungsi |
| 3   | Report.java        | membuat sendiri   |
| 4   | Users.java         | membuat sendiri   |

## Test Cases

| No  | Input                       | Output                                                                                        |
| --- | --------------------------- | --------------------------------------------------------------------------------------------- |
| 1   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | 12345                       | 1. Login                                                                                      |
|     | 3                           | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Masukkan username baru: Masukkan password: Akun   berhasil dibuat.                |
|     |                             |                                                                                               |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 2   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 5                           |                                                                                               |
|     | 3                           | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 3   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 1                           |                                                                                               |
|     | 100000                      | === Dompet Digital ===                                                                        |
|     | 3                           | 1. Login                                                                                      |
|     | oben                        | 2. Daftar                                                                                     |
|     | 10000                       | 3. Keluar                                                                                     |
|     | 5                           | Pilih opsi: Username: Password:                                                               |
|     | 3                           | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Masukkan jumlah deposit: Deposit berhasil.                                        |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp100000.0                                                                             |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Masukkan username tujuan: Masukkan jumlah transfer: Transfer   berhasil ke oben   |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp100000.0                                                                             |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 4   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 2                           | 2. Daftar                                                                                     |
|     | andre                       | 3. Keluar                                                                                     |
|     | andre                       | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 2                           |                                                                                               |
|     | samuel                      | === Dompet Digital ===                                                                        |
|     | samuel                      | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 1                           |                                                                                               |
|     | 100000                      | === Dompet Digital ===                                                                        |
|     | 3                           | 1. Login                                                                                      |
|     | andre                       | 2. Daftar                                                                                     |
|     | 20000                       | 3. Keluar                                                                                     |
|     | 5                           | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 1                           |                                                                                               |
|     | andre                       | === Dompet Digital ===                                                                        |
|     | andre                       | 1. Login                                                                                      |
|     | 3                           | 2. Daftar                                                                                     |
|     | samuel                      | 3. Keluar                                                                                     |
|     | 13000                       | Pilih opsi: Username: Password:                                                               |
|     | 5                           | --- Menu Costumer ---                                                                         |
|     | 3                           | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Masukkan jumlah deposit: Deposit berhasil.                                        |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp100000.0                                                                             |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Masukkan username tujuan: Masukkan jumlah transfer: Transfer   berhasil ke andre  |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp80000.0                                                                              |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp20000.0                                                                              |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Masukkan username tujuan: Masukkan jumlah transfer: Transfer   berhasil ke samuel |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp7000.0                                                                               |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 5   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 2                           | 2. Daftar                                                                                     |
|     | andre                       | 3. Keluar                                                                                     |
|     | andre                       | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 2                           |                                                                                               |
|     | samuel                      | === Dompet Digital ===                                                                        |
|     | samuel                      | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 1                           |                                                                                               |
|     | 100000                      | === Dompet Digital ===                                                                        |
|     | 3                           | 1. Login                                                                                      |
|     | andre                       | 2. Daftar                                                                                     |
|     | 20000                       | 3. Keluar                                                                                     |
|     | 5                           | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 1                           |                                                                                               |
|     | andre                       | === Dompet Digital ===                                                                        |
|     | andre                       | 1. Login                                                                                      |
|     | 5                           | 2. Daftar                                                                                     |
|     | 3                           | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Masukkan jumlah deposit: Deposit berhasil.                                        |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp100000.0                                                                             |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Masukkan username tujuan: Masukkan jumlah transfer: Transfer   berhasil ke andre  |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp80000.0                                                                              |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp20000.0                                                                              |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 6   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 4                           |                                                                                               |
|     | Sangat Lama dalam prosesnya | === Dompet Digital ===                                                                        |
|     | 5                           | 1. Login                                                                                      |
|     | 3                           | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Tuliskan masalah Anda: Laporan dikirim.                                           |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 7   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 4                           |                                                                                               |
|     | Sangat Lama dalam prosesnya | === Dompet Digital ===                                                                        |
|     | 5                           | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | admin                       | 3. Keluar                                                                                     |
|     | admin123                    | Pilih opsi: Username: Password:                                                               |
|     | 1                           | --- Menu Costumer ---                                                                         |
|     | 3                           | Saldo: Rp0.0                                                                                  |
|     | 3                           | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Tuliskan masalah Anda: Laporan dikirim.                                           |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | No   \| Nama Akun       \| Masalah                                                            |
|     |                             | -------------------------------------------                                                   |
|     |                             | 0001 \| oben            \| Sangat   Lama dalam prosesnya                                      |
|     |                             |                                                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 8   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 4                           |                                                                                               |
|     | Sangat Lama dalam prosesnya | === Dompet Digital ===                                                                        |
|     | 5                           | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | admin                       | 3. Keluar                                                                                     |
|     | admin123                    | Pilih opsi: Username: Password:                                                               |
|     | 3                           | --- Menu Costumer ---                                                                         |
|     | 3                           | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Tuliskan masalah Anda: Laporan dikirim.                                           |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 9   | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 4                           |                                                                                               |
|     | Sangat Lama dalam prosesnya | === Dompet Digital ===                                                                        |
|     | 5                           | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | admin                       | 3. Keluar                                                                                     |
|     | admin123                    | Pilih opsi: Username: Password:                                                               |
|     | 2                           | --- Menu Costumer ---                                                                         |
|     | 3                           | Saldo: Rp0.0                                                                                  |
|     | 3                           | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Tuliskan masalah Anda: Laporan dikirim.                                           |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | No   \| Nama Akun       \| Total Saldo                                                        |
|     |                             | ------------------------------------                                                          |
|     |                             | 0001 \| oben            \| Rp0.00                                                             |
|     |                             | ------------------------------------                                                          |
|     |                             | Total Pengguna: 0001                                                                          |
|     |                             |                                                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
| 10  | 2                           |                                                                                               |
|     | oben                        | === Dompet Digital ===                                                                        |
|     | oben                        | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | oben                        | 3. Keluar                                                                                     |
|     | oben                        | Pilih opsi: Masukkan username baru: Masukkan password: Akun berhasil   dibuat.                |
|     | 4                           |                                                                                               |
|     | Sangat Lama dalam prosesnya | === Dompet Digital ===                                                                        |
|     | 5                           | 1. Login                                                                                      |
|     | 1                           | 2. Daftar                                                                                     |
|     | admin                       | 3. Keluar                                                                                     |
|     | admin123                    | Pilih opsi: Username: Password:                                                               |
|     | 1                           | --- Menu Costumer ---                                                                         |
|     | 2                           | Saldo: Rp0.0                                                                                  |
|     | 3                           | 1. Deposit                                                                                    |
|     | 3                           | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi: Tuliskan masalah Anda: Laporan dikirim.                                           |
|     |                             |                                                                                               |
|     |                             | --- Menu Costumer ---                                                                         |
|     |                             | Saldo: Rp0.0                                                                                  |
|     |                             | 1. Deposit                                                                                    |
|     |                             | 2. Tarik Tunai                                                                                |
|     |                             | 3. Transfer                                                                                   |
|     |                             | 4. Laporkan Masalah                                                                           |
|     |                             | 5. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi: Username: Password:                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | No   \| Nama Akun       \| Masalah                                                            |
|     |                             | -------------------------------------------                                                   |
|     |                             | 0001 \| oben            \| Sangat   Lama dalam prosesnya                                      |
|     |                             |                                                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | No   \| Nama Akun       \| Total Saldo                                                        |
|     |                             | ------------------------------------                                                          |
|     |                             | 0001 \| oben            \| Rp0.00                                                             |
|     |                             | ------------------------------------                                                          |
|     |                             | Total Pengguna: 0001                                                                          |
|     |                             |                                                                                               |
|     |                             | --- Menu Admin ---                                                                            |
|     |                             | 1. Lihat laporan masalah                                                                      |
|     |                             | 2. Lihat jumlah pengguna                                                                      |
|     |                             | 3. Logout                                                                                     |
|     |                             | Pilih opsi:                                                                                   |
|     |                             | === Dompet Digital ===                                                                        |
|     |                             | 1. Login                                                                                      |
|     |                             | 2. Daftar                                                                                     |
|     |                             | 3. Keluar                                                                                     |
|     |                             | Pilih opsi:                                                                                   |

## Compile

`mvn clean package`

## Run

`java -cp target/app.jar del.alstrudat.App`
