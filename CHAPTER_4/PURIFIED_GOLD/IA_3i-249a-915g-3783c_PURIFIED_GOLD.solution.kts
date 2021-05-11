
solution {
    puzzle = "P036"
    name = "INSTRUCTIONS 15"
    arm(ARM6) {
        number = 1
        position = -12 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -21 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -16 to -8
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -11 to -1
        rotation = -17
    }
    glyph(PURIFICATION) {
        position = -10 to 0
        rotation = -13
    }
    glyph(PURIFICATION) {
        position = -13 to 1
        rotation = -22
    }
    glyph(PURIFICATION) {
        position = -14 to 4
        rotation = -16
    }
    glyph(PURIFICATION) {
        position = -15 to 6
        rotation = -12
    }
    glyph(PURIFICATION) {
        position = -16 to 4
        rotation = -21
    }
    glyph(PURIFICATION) {
        position = -21 to 7
        rotation = -11
    }
    glyph(PURIFICATION) {
        position = -19 to 6
        rotation = -15
    }
    glyph(PURIFICATION) {
        position = -19 to 4
        rotation = -20
    }
    glyph(PURIFICATION) {
        position = -22 to 2
        rotation = -10
    }
    glyph(PURIFICATION) {
        position = -21 to 3
        rotation = -14
    }
    glyph(PURIFICATION) {
        position = -19 to 2
        rotation = -19
    }
    glyph(PURIFICATION) {
        position = -16 to -2
        rotation = -23
    }
    glyph(PURIFICATION) {
        position = -18 to -2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -11 to -5
        rotation = -16
    }
    glyph(PURIFICATION) {
        position = -18 to -4
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -14 to -6
        rotation = -8
    }
    io(INPUT) {
        index = 0
        position = -11 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -13 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -18 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -21 to 4
        rotation = 0
    }
    track {
        position = -12 to -2
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 2 to 0, 2 to 1, 3 to 0, 4 to 0, 5 to 0, 5 to 1, 4 to 2, 3 to 3, 2 to 3, 1 to 3, 0 to 3, -1 to 4, 0 to 4, 0 to 5, -1 to 6, -2 to 7, -1 to 7, -1 to 8, -1 to 9, -2 to 10, -3 to 10, -4 to 10, -4 to 9, -4 to 8, -4 to 7, -5 to 7, -5 to 8, -6 to 9, -7 to 9, -8 to 9, -8 to 10, -9 to 11, -10 to 12, -11 to 12, -11 to 11, -11 to 10, -10 to 9, -9 to 8, -8 to 7, -8 to 6, -9 to 7, -10 to 7, -10 to 6, -10 to 5, -11 to 6, -12 to 6, -13 to 6, -13 to 5, -12 to 4, -11 to 3, -10 to 3, -9 to 3, -8 to 3, -7 to 3, -6 to 2, -5 to 2, -4 to 2, -4 to 3, -5 to 4, -4 to 4, -3 to 3, -3 to 2, -3 to 1, -3 to 0, -3 to -1, -4 to -1, -4 to -2, -5 to -2, -6 to -1, -7 to 0, -7 to 1, -6 to 1, -7 to 2, -8 to 2, -9 to 2, -10 to 2, -10 to 1, -9 to 0, -8 to -1, -7 to -2, -7 to -3, -6 to -4, -5 to -5, -4 to -5, -3 to -5, -3 to -4, -3 to -3, -2 to -3, -1 to -3, 0 to -4, 0 to -5, 1 to -5, 1 to -4, 2 to -4, 2 to -3, 1 to -2, 0 to -1, -1 to -1, -1 to -2, -2 to -1, -2 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
