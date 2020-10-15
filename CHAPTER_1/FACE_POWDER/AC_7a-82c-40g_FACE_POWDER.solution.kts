
solution {
    puzzle = "P009"
    name = "B GGAG"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
