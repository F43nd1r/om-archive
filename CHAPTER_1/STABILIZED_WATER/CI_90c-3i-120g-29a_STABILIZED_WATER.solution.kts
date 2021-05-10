
solution {
    puzzle = "P007"
    name = "INSTRUCTIONS 13"
    arm(ARM6) {
        number = 1
        position = -2 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = 0
    }
    track {
        position = -8 to 3
        positions = listOf(6 to -5, 7 to -5, 8 to -5, 8 to -4, 7 to -3, 6 to -3, 5 to -3, 4 to -3, 4 to -4, 5 to -5)
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
