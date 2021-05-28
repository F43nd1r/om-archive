
solution {
    puzzle = "w1698785633"
    name = "NEW SOLUTION 1"
    arm(ARM2) {
        number = 1
        position = 1 to -2
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM2) {
        number = 3
        position = 5 to -5
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -2 to -4
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -6
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 3 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
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
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
