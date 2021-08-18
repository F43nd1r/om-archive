
solution {
    puzzle = "P018"
    name = "NEW SOLUTION 5"
    arm(ARM6) {
        number = 1
        position = -4 to -3
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -4 to -2
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -1 to -4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -5 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -3
        rotation = -4
    }
    io(INPUT) {
        index = 2
        position = -5 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        )
    }
}
