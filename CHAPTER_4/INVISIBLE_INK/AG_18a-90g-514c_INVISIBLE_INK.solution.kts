
solution {
    puzzle = "P032"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 1 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -2
        rotation = -2
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                rotateClockwise()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                forward()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                back()
                extend()
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                retract()
                forward()
                extend()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                retract()
                back()
                extend()
                reset()
                wait(1)
                grab()
                forward()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                retract()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                forward()
                drop()
                back()
                grab()
                retract()
                forward()
                extend()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                retract()
                back()
                forward()
                extend()
                reset()
            }
        }
        )
    }
}
