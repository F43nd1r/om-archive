
solution {
    puzzle = "P075"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -3 to 4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 5 to 4
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 7 to 4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 6 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 7 to 3
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -4 to 4
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 4
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = 7 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 7 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 9 to 2
        rotation = -2
    }
    conduit {
        id = 100
        position = -2 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 5 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(19)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(431)
                grab()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(11)
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(37)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                drop()
                extend()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
            }
        }
        )
    }
}
