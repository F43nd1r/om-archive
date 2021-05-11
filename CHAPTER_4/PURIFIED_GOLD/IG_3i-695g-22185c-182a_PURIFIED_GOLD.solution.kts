
solution {
    puzzle = "P036"
    name = "INSTRUCTIONS 20"
    arm(ARM6) {
        number = 1
        position = 6 to -5
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -8 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -11 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -8 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -10 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 6 to -7
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -12 to 1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -8 to -4
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -7 to 1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -5 to -4
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 0 to -4
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 4 to -7
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -5
        rotation = 0
    }
    track {
        position = -1 to -4
        positions = listOf(7 to -1, 6 to -1, 5 to -1, 4 to 0, 3 to 1, 2 to 1, 1 to 2, 1 to 3, 0 to 4, 0 to 5, -1 to 6, -2 to 7, -3 to 7, -3 to 6, -3 to 5, -3 to 4, -2 to 3, -1 to 3, -1 to 2, -2 to 2, -3 to 2, -4 to 2, -5 to 3, -5 to 2, -6 to 2, -7 to 3, -8 to 4, -8 to 5, -7 to 5, -8 to 6, -9 to 6, -10 to 6, -11 to 6, -12 to 6, -12 to 5, -12 to 4, -11 to 3, -10 to 2, -9 to 2, -9 to 3, -8 to 3, -7 to 2, -6 to 1, -5 to 0, -5 to -1, -6 to -1, -5 to -2, -4 to -2, -3 to -3, -2 to -3, -2 to -2, -1 to -3, 0 to -3, 0 to -2, -1 to -2, -2 to -1, -3 to 0, -3 to 1, -2 to 1, -1 to 1, 0 to 1, 1 to 1, 2 to 0, 2 to -1, 3 to -2, 4 to -2, 5 to -2, 6 to -3, 7 to -4, 7 to -5, 6 to -5, 7 to -6, 8 to -6, 8 to -5, 8 to -4, 8 to -3, 8 to -2)
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
