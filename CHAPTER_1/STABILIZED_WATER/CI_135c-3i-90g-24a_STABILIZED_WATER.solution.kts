
solution {
    puzzle = "P007"
    name = "INSTRUCTIONS 6"
    arm(ARM6) {
        number = 1
        position = -4 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = 0
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to -1, 3 to -2, 2 to -2, 1 to -2, 0 to -1)
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
