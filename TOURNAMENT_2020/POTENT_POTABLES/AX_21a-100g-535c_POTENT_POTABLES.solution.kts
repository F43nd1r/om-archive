
solution {
    puzzle = "w2501727721"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = -4 to 3
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -1 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = -2 to 0
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                grab()
                retract()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
                extend()
                wait(2)
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(4)
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                wait(4)
                grab()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                retract()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                wait(4)
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
