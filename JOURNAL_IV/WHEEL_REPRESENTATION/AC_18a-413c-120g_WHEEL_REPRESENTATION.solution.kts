
solution {
    puzzle = "P070"
    name = "B AA 4T"
    arm(PISTON) {
        number = 1
        position = -2 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -1 to 2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -5
    }
    glyph(CALCIFICATION) {
        position = -5 to 3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -2 to 1
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(4)
                grab()
                extend()
                wait(5)
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                wait(3)
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(6)
                grab()
                rotateClockwise()
                wait(1)
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                pivotCounterClockwise()
                extend()
                reset()
                wait(8)
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                extend()
                extend()
                wait(3)
                grab()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                wait(6)
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                wait(1)
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(5)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(5)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                wait(1)
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                extend()
                rotateCounterClockwise()
                retract()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                wait(1)
                grab()
                extend()
                wait(2)
                retract()
                drop()
                rotateClockwise()
                extend()
                wait(3)
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                extend()
                wait(2)
                grab()
                extend()
                rotateCounterClockwise()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                retract()
                extend()
                drop()
                retract()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                extend()
                rotateCounterClockwise()
                wait(3)
                retract()
                drop()
                retract()
                retract()
                grab()
                extend()
                wait(2)
                retract()
                drop()
                rotateClockwise()
                extend()
                wait(3)
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                rotateClockwise()
                rotateCounterClockwise()
                retract()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                extend()
                rotateCounterClockwise()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
