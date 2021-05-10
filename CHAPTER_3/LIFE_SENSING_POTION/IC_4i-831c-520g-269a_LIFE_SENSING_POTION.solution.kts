
solution {
    puzzle = "P030b"
    name = "INSTRUCTIONS 5"
    arm(ARM6) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 5 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 8 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 6 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 7 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -8
    }
    io(INPUT) {
        index = 1
        position = 8 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -2
        rotation = 0
    }
    track {
        position = 4 to -4
        positions = listOf(-3 to 2, -2 to 2, -1 to 1, -1 to 0, 0 to 0, 0 to 1, 1 to 0, 1 to -1, 1 to -2, 2 to -3, 3 to -3, 2 to -2, 3 to -2, 3 to -1, 4 to -2, 5 to -3, 5 to -2, 5 to -1, 6 to -1, 5 to 0, 5 to 1, 6 to 1, 6 to 2, 7 to 1, 7 to 0, 7 to -1, 8 to -1, 8 to 0, 8 to 1, 8 to 2, 7 to 3, 6 to 3, 6 to 4, 5 to 4, 4 to 4, 3 to 5, 2 to 5, 1 to 5, 0 to 5, 0 to 6, -1 to 6, -1 to 5, -2 to 6, -3 to 7, -2 to 7, -2 to 8, -1 to 8, -1 to 7, 0 to 7, 1 to 7, 2 to 7, 1 to 8, 0 to 9, -1 to 9, -2 to 9, -3 to 9, -3 to 8, -4 to 8, -4 to 7, -5 to 7, -4 to 6, -5 to 6, -6 to 7, -7 to 7, -6 to 6, -7 to 6, -6 to 5, -6 to 4, -5 to 3, -4 to 2)
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
