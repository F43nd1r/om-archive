
solution {
    puzzle = "P106"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -5 to 1
        rotation = -6
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = -8
    }
    glyph(TRIPLEX_BONDER) {
        position = -4 to 3
        rotation = -8
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = -10
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = -6
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                retract()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                wait(2)
                grab()
                extend()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                pivotCounterClockwise()
                retract()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                wait(9)
                rotateClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(7)
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                wait(7)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(13)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                wait(5)
                grab()
                pivotCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(7)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                retract()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                extend()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                retract()
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                reset()
            }
        }
        )
    }
}
