
solution {
    puzzle = "P088"
    name = "B ACX 2T"
    arm(PISTON) {
        number = 1
        position = -4 to 0
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -2 to 3
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -1 to 3
        rotation = 10
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 3
        rotation = 12
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, -1 to 1, -1 to 2)
    }
    track {
        position = -4 to 4
        positions = listOf(1 to 0, 2 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(6)
                grab()
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                back()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                grab()
                extend()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                wait(6)
                pivotClockwise()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(2)
                grab()
                retract()
                reset()
                wait(8)
                grab()
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                pivotClockwise()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                forward()
                wait(9)
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                wait(3)
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                retract()
                rotateClockwise()
                extend()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                extend()
                wait(5)
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                retract()
                forward()
                rotateClockwise()
                extend()
                extend()
                drop()
                forward()
                wait(3)
                grab()
                retract()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                back()
                grab()
                forward()
                extend()
                retract()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                wait(3)
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                retract()
                pivotClockwise()
                wait(4)
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                extend()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                wait(4)
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                extend()
                wait(9)
                retract()
                pivotCounterClockwise()
                extend()
                back()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                retract()
                retract()
                forward()
                rotateClockwise()
                extend()
                extend()
                retract()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                back()
                grab()
                forward()
                extend()
                retract()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
