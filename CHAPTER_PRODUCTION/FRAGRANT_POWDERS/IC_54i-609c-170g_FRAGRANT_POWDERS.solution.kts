
solution {
    puzzle = "P075"
    name = "B II 1-3T"
    arm(ARM6) {
        number = 1
        position = -3 to 4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 8 to 2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 6 to 3
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 6 to 5
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -4 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 7 to 4
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 5
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to 4
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 5 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 5 to 6
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = 9 to 4
        rotation = -1
    }
    conduit {
        id = 100
        position = -2 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 7 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(15)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                wait(9)
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                extend()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(45)
                grab()
                rotateClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(418)
                grab()
                drop()
            }
        }
        )
    }
}
