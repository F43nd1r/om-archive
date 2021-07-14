
solution {
    puzzle = "P066"
    name = "B ACX"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -3 to 2
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 0
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 1, -1 to 1, -2 to 1, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                back()
                drop()
                extend()
                grab()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                wait(1)
                pivotClockwise()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                forward()
                drop()
                forward()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                forward()
                drop()
                back()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                drop()
                back()
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                forward()
                drop()
                back()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                drop()
                back()
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                pivotClockwise()
                drop()
                extend()
                grab()
                back()
                drop()
                forward()
                grab()
                retract()
                drop()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(3)
                grab()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                pivotClockwise()
                back()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                pivotClockwise()
                back()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
