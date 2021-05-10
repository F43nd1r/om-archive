
solution {
    puzzle = "P014"
    name = "INSTRUCTIONS 8"
    arm(ARM6) {
        number = 1
        position = -9 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -10 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -10 to -2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -4
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -9 to -2
        rotation = 0
    }
    track {
        position = -7 to -5
        positions = listOf(-2 to 2, -1 to 2, -1 to 3, -2 to 4, -1 to 4, 0 to 4, 1 to 3, 2 to 2, 3 to 1, 3 to 0, 2 to 0, 3 to -1, 3 to -2, 2 to -2, 1 to -1, 0 to 0, -1 to 1)
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
