
solution {
    puzzle = "P098"
    name = "B AC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to 2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -3 to 0
        rotation = 8
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to 2
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 4
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -5 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(21)
                rotateCounterClockwise()
                rotateClockwise()
                wait(25)
                rotateClockwise()
                wait(17)
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(40)
                rotateCounterClockwise()
                rotateClockwise()
                wait(14)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                drop()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
                wait(32)
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                wait(27)
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
