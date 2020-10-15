
solution {
    puzzle = "P066"
    name = "B ACX"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 0 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 4
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = -1 to 2
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(-1 to -1, -1 to 0, 0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                back()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                wait(1)
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                wait(1)
                grab()
                extend()
                drop()
                retract()
                wait(3)
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                grab()
                forward()
                pivotClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                rotateCounterClockwise()
                forward()
                drop()
                retract()
                grab()
                extend()
                extend()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                retract()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                extend()
                wait(3)
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                pivotCounterClockwise()
                forward()
                forward()
                back()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                wait(8)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
