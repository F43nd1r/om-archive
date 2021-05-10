
solution {
    puzzle = "P007"
    name = "NEW SOLUTION 17"
    arm(ARM6) {
        number = 1
        position = -8 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -5 to -7
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -6 to -7
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -7 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -8 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -6 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
