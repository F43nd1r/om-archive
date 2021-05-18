
solution {
    puzzle = "P066"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -17 to -9
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -11 to -6
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -11 to -5
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -11 to -11
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -14 to -15
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -14 to -9
        rotation = 1
    }
    glyph(BONDER) {
        position = -18 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = -11 to -9
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -11 to -7
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -13 to -9
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -21 to -6
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -20 to -9
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -10 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -17 to -12
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
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
            sequence(5) {
                wait(8)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
