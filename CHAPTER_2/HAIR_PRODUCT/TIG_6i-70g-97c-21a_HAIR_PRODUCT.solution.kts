
solution {
    puzzle = "P016"
    name = "NEW SOLUTION 9"
    arm(ARM6) {
        number = 1
        position = -7 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -5 to -7
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -7 to -4
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -8 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -6
        rotation = -5
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
                wait(2)
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        )
    }
}
