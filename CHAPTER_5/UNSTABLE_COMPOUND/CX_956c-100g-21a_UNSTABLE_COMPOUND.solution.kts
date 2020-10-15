
solution {
    puzzle = "P040"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 3 to -4
        positions = listOf(-2 to 2, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                extend()
                pivotClockwise()
                extend()
                pivotClockwise()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                retract()
                rotateClockwise()
                forward()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                extend()
                retract()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                extend()
                drop()
                forward()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                rotateClockwise()
                back()
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
                back()
                grab()
                retract()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                back()
                drop()
                forward()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                extend()
                extend()
                retract()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                extend()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                extend()
                retract()
                rotateClockwise()
                forward()
                extend()
                reset()
            }
        }
        )
    }
}
