
solution {
    puzzle = "w2501727721"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = -4 to 4
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -1 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = -2 to 1
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
                wait(4)
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                extend()
                retract()
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
                wait(1)
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                wait(5)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                retract()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
