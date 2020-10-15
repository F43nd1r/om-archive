
solution {
    puzzle = "P102"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 0 to -3
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to -4
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -5
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = -3
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                back()
                forward()
                retract()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                retract()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                extend()
                drop()
                forward()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                retract()
                grab()
                back()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                retract()
                pivotCounterClockwise()
                forward()
                drop()
                extend()
                extend()
                grab()
                back()
                forward()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                retract()
                rotateClockwise()
                extend()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                forward()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                retract()
                forward()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                forward()
                extend()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                forward()
                back()
                reset()
            }
        }
        )
    }
}
