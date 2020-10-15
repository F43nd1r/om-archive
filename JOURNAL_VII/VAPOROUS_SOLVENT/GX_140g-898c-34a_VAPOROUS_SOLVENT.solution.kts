
solution {
    puzzle = "P098"
    name = "B AGX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to 2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -3 to 0
        rotation = 2
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
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(60)
                rotateClockwise()
                wait(51)
                rotateClockwise()
                rotateClockwise()
                wait(34)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                drop()
                extend()
                grab()
                forward()
                retract()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                pivotClockwise()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                forward()
                back()
                drop()
                retract()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                retract()
                pivotCounterClockwise()
                drop()
                extend()
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
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                forward()
                back()
                drop()
                retract()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
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
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                forward()
                back()
                drop()
                retract()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
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
        )
    }
}
