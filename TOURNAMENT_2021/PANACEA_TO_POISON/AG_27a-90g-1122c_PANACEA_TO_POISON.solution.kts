
solution {
    puzzle = "w2450511665"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 2 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to -4
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 1
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                forward()
                grab()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                extend()
                extend()
                forward()
                drop()
                retract()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                extend()
                forward()
                drop()
                retract()
                grab()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                back()
                reset()
            }
        }
        )
    }
}
