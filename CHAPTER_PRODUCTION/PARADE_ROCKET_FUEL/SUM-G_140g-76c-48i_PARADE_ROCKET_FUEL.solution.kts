
solution {
    puzzle = "P082"
    name = "B S 2T"
    arm(PISTON) {
        number = 1
        position = 1 to 4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to 1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 3 to 4
        rotation = -3
    }
    conduit {
        id = 100
        position = 1 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 5 to 0
        rotation = 1
    }
    conduit {
        id = 101
        position = 6 to 1
        rotation = 0
    }
    conduit {
        id = 101
        position = 8 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                retract()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                extend()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                pivotClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
