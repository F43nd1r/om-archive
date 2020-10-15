
solution {
    puzzle = "P027"
    name = "B AGX 6T"
    arm(PISTON) {
        number = 1
        position = 2 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 4 to -2
        positions = listOf(-2 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                extend()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                grab()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
