
solution {
    puzzle = "P093"
    name = "B GG"
    arm(PISTON) {
        number = 1
        position = 8 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 9 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to 2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 9 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 8 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 7 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 10 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 7 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 11 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                retract()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                retract()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
