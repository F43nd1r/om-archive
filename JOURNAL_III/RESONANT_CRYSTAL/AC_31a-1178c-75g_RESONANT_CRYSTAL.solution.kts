
solution {
    puzzle = "P066"
    name = "SHOWCASE PLS"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
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
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
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
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 1, -1 to 1, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                extend()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                back()
                reset()
                wait(4)
                grab()
                forward()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                extend()
                pivotClockwise()
                forward()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                extend()
                pivotClockwise()
                forward()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
