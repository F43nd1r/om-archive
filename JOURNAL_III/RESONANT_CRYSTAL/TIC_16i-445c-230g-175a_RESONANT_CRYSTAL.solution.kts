
solution {
    puzzle = "P066"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -12 to -6
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -21 to -10
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -22 to -10
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -15 to -10
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -9 to -3
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -12 to -9
        rotation = -1
    }
    glyph(BONDER) {
        position = -18 to -10
        rotation = 1
    }
    glyph(BONDER) {
        position = -16 to -13
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -20 to -10
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -15 to -13
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -12 to -13
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -15 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -22 to -9
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -9 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
