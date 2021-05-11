
solution {
    puzzle = "P032"
    name = "INSTRUCTIONS 6"
    arm(ARM6) {
        number = 1
        position = -3 to 5
        rotation = 1
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to 2
        rotation = 6
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 8
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 1
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to 5
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 8
        rotation = -2
    }
    track {
        position = -2 to -2
        positions = listOf(-1 to 7, -2 to 8, -1 to 8, 0 to 8, 1 to 8, 1 to 7, 2 to 7, 2 to 8, 3 to 8, 4 to 8, 5 to 8, 6 to 7, 7 to 6, 7 to 5, 7 to 4, 7 to 3, 7 to 2, 7 to 1, 7 to 0, 7 to -1, 6 to -1, 5 to -1, 5 to -2, 4 to -2, 3 to -2, 2 to -2, 1 to -2, 0 to -1, 0 to 0, 1 to -1, 2 to -1, 3 to -1, 4 to -1, 4 to 0, 5 to 0, 6 to 0, 5 to 1, 6 to 1, 5 to 2, 5 to 3, 5 to 4, 6 to 3, 6 to 4, 6 to 5, 6 to 6, 5 to 7, 5 to 6, 4 to 7, 4 to 6, 3 to 7, 3 to 6, 2 to 6, 1 to 6, 0 to 7, 0 to 6, 0 to 5, -1 to 5, -2 to 6, -3 to 7, -4 to 7, -3 to 6, -4 to 6, -3 to 5, -3 to 4, -3 to 3, -4 to 4, -4 to 3, -5 to 4, -5 to 5, -6 to 6, -6 to 7, -7 to 8, -7 to 9, -8 to 10, -7 to 10, -6 to 9, -5 to 9, -5 to 10, -4 to 9, -3 to 8, -2 to 7, -1 to 6)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
